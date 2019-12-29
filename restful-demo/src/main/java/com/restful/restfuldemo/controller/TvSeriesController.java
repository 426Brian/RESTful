package com.restful.restfuldemo.controller;

import com.restful.restfuldemo.entity.Demo;
import com.restful.restfuldemo.entity.TV;
import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.*;

@RestController
@RequestMapping("/tvseries")
public class TvSeriesController {
    private static HashSet<TV> set = new HashSet<>();
    private static final Log log = (Log) LogFactory.getLog(TvSeriesController.class);

    // 当前工程的根路径
    private static String USER_FILE = System.getProperty("user.dir");

    /**
     * hello world 测试
     *
     * @return
     */
    @GetMapping("/demo/{id}")
    public Map<String, Object> sayHello(@PathVariable("id") int id) {
        HashMap<String, Object> result = new HashMap<>();
        result.put("message", "hello world");
        Demo demo = new Demo();
        TV tv = new TV();
        if (set.size() < 1) {
            set.add(tv);
            return result;
        }

        TV tv1 = set.iterator().next();
        System.out.println("tv.hashCode --> " + tv.hashCode() + " tv1.hashCode --> " + tv1.hashCode());
        System.out.println("tv.equals(tv2) --> " + tv.equals(tv1));
        System.out.println("tv == tv2 ---> " + (tv == tv1));
        return result;
    }

    /**
     * 返回 TV 对象列表
     *
     * @return
     */
    @GetMapping("/allTv")
    public List<TV> getAllTv() {
        log.info("test log -----------");
        ArrayList<TV> list = new ArrayList<>();

        TV tv1 = createWestWorld();
        TV tv2 = createFlipped();
        list.addAll(Arrays.asList(tv1, tv2));

        return list;
    }

    /**
     * 根据 Id 获取到 TV 对象
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public TV getone(@PathVariable int id) {
        log.info("id  -----------" + id);
        if (id == 101) {
            return createWestWorld();
        } else if (id == 102) {
            return createFlipped();
        }
        return null;

    }

    /**
     * 接收 requestbody 中的 TV 对象
     *
     * @param tv
     * @return
     */
    @PostMapping("/postOne")
    public TV insertOne(@Valid @RequestBody TV tv) {
        log.info(tv);
        tv.setId(999);
        System.out.println("tv == " + tv.hashCode());
        return tv;
    }


    @DeleteMapping("/deletOne")
    public TV deletOne(@RequestBody TV tv) {
        log.info(tv);
        tv.setId(1000);
        return tv;
    }

    /**
     * 上传文件
     *
     * @param file
     */
    @PostMapping(path = "/file", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String addFile(@RequestParam("file") MultipartFile file) {
        log.info("addFile ========");
        InputStream inputStream = null;
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(Paths.get(USER_FILE, "doc", "demo.txt").toFile());
            inputStream = file.getInputStream();

            IOUtils.copy(inputStream, fos);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return "fail";

    }


    @GetMapping(value = "/img", produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] getimg() throws IOException {

        InputStream inputStream = null;
        try {

            inputStream = new FileInputStream(Paths.get(USER_FILE, "img", "Begonia.jpg").toFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return IOUtils.toByteArray(inputStream);
    }

    private TV createWestWorld() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, Calendar.MONTH, 2, 0, 0);
        return new TV(101, "west world", 2, calendar.getTime());
    }

    private TV createFlipped() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, Calendar.MONTH, 2, 0, 0);
        return new TV(102, "Flipped", 2, calendar.getTime());
    }


    public static void main(String[] args) {
        TvSeriesController tvSeriesController = new TvSeriesController();
        tvSeriesController.test();
        tvSeriesController.test();

        set.clear();
    }

    public Demo test() {
        Demo demot = new Demo();
        demot.setName("5");
        demot.setSeasonCount(3);
        System.out.println(" demot== " + demot.hashCode() + " == " + demot.toString());

        return demot;
    }


}

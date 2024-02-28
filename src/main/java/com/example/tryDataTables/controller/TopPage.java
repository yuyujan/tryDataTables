package com.example.tryDataTables.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.tryDataTables.dto.datum;


@Controller
public class TopPage {

    @GetMapping("index")
    public String getIndex() {
        return "index";
    }

    @GetMapping("fetchData")
    @ResponseBody
    public List<datum> postMethodName() {
        List<datum> data = new ArrayList<>();
        for (long i = 0; i < 100000; i++) {
            data.add(createData(i));
        }
        return data;

    }

    private datum createData(Long n) {
        Random random = new Random();
        datum d = new datum("data" + Long.toString(n), n * random.nextLong(), n * random.nextLong(),
                n * random.nextLong(), n * random.nextLong(), n * random.nextLong(), n * random.nextLong(),
                n * random.nextLong(), n * random.nextLong(), n * random.nextLong(), n * random.nextLong(),
                n * random.nextLong(), n * random.nextLong(), n * random.nextLong(), n * random.nextLong(),
                n * random.nextLong(), n * random.nextLong(), n * random.nextLong(), n * random.nextLong(),
                n * random.nextLong(), n * random.nextLong(), n * random.nextLong(), n * random.nextLong(),
                n * random.nextLong(), n * random.nextLong(), n * random.nextLong(), n * random.nextLong(),
                n * random.nextLong(), n * random.nextLong(), n * random.nextLong(), n * random.nextLong(),
                n * random.nextLong(), n * random.nextLong(), n * random.nextLong(), n * random.nextLong(),
                n * random.nextLong(), n * random.nextLong(), n * random.nextLong(), n * random.nextLong(),
                n * random.nextLong(), n);
        return d;

    }

}

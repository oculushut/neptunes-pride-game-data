package com.oculushut.neptune;

import feign.Param;
import feign.QueryMap;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@FeignClient(name ="neptune", url="https://np.ironhelmet.com")
public interface NeptuneClient {

    @PostMapping(path="/api", params = {"api_version", "game_number", "code"})
    String getData(
            @RequestParam("api_version") String api_version,
            @RequestParam("game_number") String game_number,
            @RequestParam("code") String code,
            @RequestBody String empty_body);//error from Neptune's Pride API without this
}

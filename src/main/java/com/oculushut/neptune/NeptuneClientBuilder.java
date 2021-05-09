package com.oculushut.neptune;

import feign.Feign;
import lombok.Getter;
//import feign.okhttp.OkHttpClient;

@Getter
public class NeptuneClientBuilder {

    /*
    private NeptuneClient neptuneClient = createClient(NeptuneClient.class);

    private static <T> T createClient(Class<T> type, String uri) {
        return Feign.builder().target(type, uri);
        /*
                .client(new OkHttpClient())
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .logger(new Slf4jLogger(type))
                .logLevel(Logger.Level.FULL)
                .target(type, uri);
         */
    //}

}
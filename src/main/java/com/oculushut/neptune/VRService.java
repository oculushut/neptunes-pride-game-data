package com.oculushut.neptune;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class VRService {
    @Autowired
    private NeptuneClient neptuneClient;
    @Value("${neptunesPride.apiSettings.apiVersion}")
    private String apiVersion;
    @Value("${neptunesPride.apiSettings.gameNumber}")
    private String gameNumber;
    @Value("${neptunesPride.apiSettings.code}")
    private String code;

    public String getData(){
        String data = neptuneClient.getData(apiVersion, gameNumber, code, "{}");
        return data;
    }

}

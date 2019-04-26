package controllers;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.IFavService;
import vo.Pig;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;

@RestController
@RequestMapping("/rest/api/RestTest")

public class RequestTestController {

    @Autowired
    private IFavService favService;

    @GetMapping
    public String TestString(String pigId){
        if(pigId == null || pigId == "") pigId="1";
        Pig pig = new Pig();
        pig.setPigId(Integer.parseInt(pigId));
        return JSON.toJSONString(favService.queryPigByVO(pig));
    }

    @PostMapping
    public String TestPostString(HttpServletRequest request){
        JSONObject jsonObject = getJSON(request);
        String guest = jsonObject.getString("guestName");
        return "post guest " + guest + " time: " + new Date();
    }

    private JSONObject getJSON(HttpServletRequest request){
        String param= null;
        JSONObject jsonObject = null;
        try {
            BufferedReader streamReader = new BufferedReader( new InputStreamReader(request.getInputStream(), "UTF-8"));
            StringBuilder responseStrBuilder = new StringBuilder();
            String inputStr;
            while ((inputStr = streamReader.readLine()) != null)
                responseStrBuilder.append(inputStr);

            jsonObject = JSONObject.parseObject(responseStrBuilder.toString());
            param= jsonObject.toJSONString();
            System.out.println(param);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonObject;

    }
}

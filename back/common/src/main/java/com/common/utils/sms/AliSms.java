package com.common.utils.sms;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;

/**
 * 阿里云短信服务
 * @author
 */
public class AliSms {
    public static String sendSms(String phoneNumber,String code){
       //输入自己的 ALIYUN_ACCESS_KEY_ID，ALIYUN_ACCESS_KEY_SECRET
        DefaultProfile profile = DefaultProfile.getProfile("cn-shenzhen", "ALIYUN_ACCESS_KEY_ID",
                "ALIYUN_ACCESS_KEY_SECRET");
        IAcsClient client = new DefaultAcsClient(profile);
        CommonRequest request = new CommonRequest();
        request.setSysMethod(MethodType.POST);
        request.setSysDomain("dysmsapi.aliyuncs.com");
//        request.setSysDomain("dysmsapi.ap-southeast-1.aliyuncs.com");
        request.setSysVersion("2017-05-25");
        request.setSysAction("SendSms");
//        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("RegionId", "cn-shenzhen");
        request.putQueryParameter("PhoneNumbers", phoneNumber);
//        request.putQueryParameter("SignName", "民宿管理系统");
//        request.putQueryParameter("TemplateCode", "SMS_480120180");
//        request.putQueryParameter("TemplateCode", "SMS_314760283");
        System.out.println(code);
        request.putQueryParameter("SignName", "阿里云短信测试");
        request.putQueryParameter("TemplateCode", "SMS_154950909");
        request.putQueryParameter("TemplateParam", "{\"code\":\""+code+"\"}");
        try {
            CommonResponse response = client.getCommonResponse(request);
            JSONObject jsonObj = JSONObject.parseObject(response.getData());
            return jsonObj.get("Message").toString();
        } catch (ServerException e) {
            e.printStackTrace();
            return "error";
        } catch (ClientException e) {
            e.printStackTrace();
            return "error";
        }
    }
}

package grimm.study.auth2.config;

import grimm.study.common.enums.ResultEnum;
import grimm.study.common.vo.ServerResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;
import org.springframework.security.oauth2.provider.error.DefaultWebResponseExceptionTranslator;
import org.springframework.security.oauth2.provider.error.WebResponseExceptionTranslator;
import sun.print.resources.serviceui;

@Configuration
public class WebResponseExceptionTranslateConfig {

    /**
     20      * 自定义登录或者鉴权失败时的返回信息
     21      */
     @Bean(name = "webResponseExceptionTranslator")
     public WebResponseExceptionTranslator webResponseExceptionTranslator() {
                 return new DefaultWebResponseExceptionTranslator() {
             @Override
             public ResponseEntity translate(Exception e) throws Exception {
                                 ResponseEntity responseEntity = super.translate(e);
                                 OAuth2Exception body = (OAuth2Exception) responseEntity.getBody();
                                 HttpHeaders headers = new HttpHeaders();
                                 headers.setAll(responseEntity.getHeaders().toSingleValueMap());
                                 // do something with header or response
                                 if ( 400 == responseEntity.getStatusCode().value() ) {
                                         System.out.println(body.getMessage());
                                         if ( "Bad credentials".equals(body.getMessage()) ) {
                                                 return new ResponseEntity(ServerResponse.error(null,ResultEnum.AUTHORIZATION_ERROR), headers , HttpStatus.OK);
                                             }
                                     }
                                 return new ResponseEntity(body , headers , responseEntity.getStatusCode());

                             }
         };
             }


}
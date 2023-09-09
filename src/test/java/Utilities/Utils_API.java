package Utilities;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static Utilities.Utils.getGlobalValue;

public class Utils_API {
      public static RequestSpecification reqSpec;
      public static RequestSpecification resSpec;

      public RequestSpecification getSessionForAgencySignIn() throws IOException {

            PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));
            reqSpec= new RequestSpecBuilder().setBaseUri(getGlobalValue("baseurlAPI"))
                    .addFilter(RequestLoggingFilter.logRequestTo(log))
                    .addFilter(ResponseLoggingFilter.logResponseTo(log))
                    .setContentType(ContentType.JSON).build();
            return reqSpec;
      }
}

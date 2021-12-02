package io.getarrays.userservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class MessageRequest {
   private String username;
   private  String message;

   @Override
   public String toString() {
      return "MessageRequest{" +
              "username='" + username + '\'' +
              ", message='" + message + '\'' +
              '}';
   }
}

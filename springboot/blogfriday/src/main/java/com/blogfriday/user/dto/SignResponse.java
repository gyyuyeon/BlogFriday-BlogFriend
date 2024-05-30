//package com.blogfriday.user.dto;
package com.blogfriday.user.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SignResponse {
    private String user_idemail; // 아이디로 사용할 이메일
    private String user_password; // password
    private String user_name; // 실명저장
    private String user_phonenumber;
    private String user_nickname;
    private String user_profile;
    
    private String accessToken;
    private String refreshToken;
    
    private String profilePictureUrl; // 프로필 이미지 URL 추가

    public SignResponse(String user_idemail, String user_password){
        super();
        this.user_idemail = user_idemail;    
        this.user_password = user_password;
    }

    public SignResponse(String user_idemail, String user_password, String user_name, String user_phonenumber, String user_nickname, String user_profile) {
        super();
        this.user_idemail = user_idemail;
        this.user_password = user_password;
        this.user_name = user_name;
        this.user_phonenumber = user_phonenumber;
        this.user_nickname = user_nickname;
        this.user_profile = user_profile;
    }
}





package com.gxy.client.base;

import lombok.Data;

@Data
public class SessionUserVO {
    private String userId;
    private String phone;

    public SessionUserVO() {
    }

    public SessionUserVO(String userId) {
        this.userId = userId;
    }

    public SessionUserVO(String userId, String phone) {
        this.userId = userId;
        this.phone = phone;
    }
}

package com.example.demo.model.bo;

import com.example.demo.model.BaseMoedel;

public class AdminBo extends BaseMoedel {
    private static final long serialVersionUID = -5436628295081425245L;

    private String nickName;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}

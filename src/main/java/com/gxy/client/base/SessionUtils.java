package com.gxy.client.base;

public class SessionUtils {
    private static ThreadLocal<SessionUserVO> map = new ThreadLocal<>();


    public static SessionUserVO getUserInfo() {
        SessionUserVO sesssionUserVO = map.get();
        return sesssionUserVO;
    }

    public static void setUserInfo(SessionUserVO vo) {
        map.set(vo);

    }
}

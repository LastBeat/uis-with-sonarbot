/*
    유지보수 내용
    1. 기존 'LoginTestDrive.java'는 실질적인 Main 함수이므로 코드를 'Main.java'로 이동함.
    2. 기존 'LoginTestDrive.java'에 쓰레드에 사용되는 Runnable이 부적절하게 적용되어 있으므로 삭제함.
 */

package Main;

import Login.LoginGUI;

public class Main {
    public static void main(String[] args) {
        try {
            LoginGUI frame = new LoginGUI();
            frame.setLocationRelativeTo(null);
        } catch (Exception e) {
            System.out.println("[ERROR]로그인 화면 생성 실패");
        }
    }
    
}

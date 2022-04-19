import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;


public class AppTest {

    public Logger log = Logger.getLogger(AppTest.class);

    @Test
    @Parameters({"login"})
    public void login(String msg){
       System.out.println(msg);
        log.info(msg);
    }

    @Test
    @Parameters({"goMyProfile"})
    public void goMyProfile(String msg){
        System.out.println(msg);
        log.info(msg);
    }

    @Test(groups = {"group1"})
    @Parameters({"goMyFriends"})
    public void goMyFriends(String msg){
        System.out.println(msg);
        log.info(msg);
    }

    @Test(groups = {"group1"})
    @Parameters({"selectFriend"})
    public void selectFriend(String msg){
        System.out.println(msg);
        log.info(msg);
    }

    @Test(groups = {"group1"})
    @Parameters({"deleteFriend"})
    public void deleteFriend(String msg){
        System.out.println(msg);
        log.info(msg);
    }

    @Test
    @Parameters({"closeSession"})
    public void closeSession(String msg){
        System.out.println(msg);
        log.info(msg);
    }

    @Test(groups = {"group2"})
    @Parameters({"editProfile"})
    public void editProfile(String msg){
        System.out.println(msg);
        log.info(msg);
    }

    @Test(groups = {"group2"})
    @Parameters({"changeProfilePhoto"})
    public void changeProfilePhoto(String msg){
        System.out.println(msg);
        log.info(msg);
    }


}

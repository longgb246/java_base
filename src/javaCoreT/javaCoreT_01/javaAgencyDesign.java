package javaCoreT.javaCoreT_01;

/**
 * Created by longguangbin on 2018/5/6.
 */

interface AgencyNetwork {
    public void browse();
}

class AgencyReal implements AgencyNetwork {
    @Override
    public void browse() {
        System.out.println("上网浏览信息");
    }
}

//class AgencyProxy implements AgencyNetwork {
//    private AgencyNetwork agency_network;
//
//    public AgencyProxy(AgencyNetwork agency_network) {
//        this.agency_network = agency_network;
//    }
//    public void check(){
//        System.out.println("检查用户是否合法。p");
//    }
//}

public class javaAgencyDesign {
}

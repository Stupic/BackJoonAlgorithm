import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        if( n < 99){
            System.out.println(n);
        }else{
            TreeMap<Integer, Integer> map = new TreeMap<>();
            map.put(110, 99);
            map.put(122, 100);
            map.put(134, 101);
            map.put(146, 102);
            map.put(158, 103);
            map.put(209, 104);
            map.put(221, 105);
            map.put(233, 106);
            map.put(245, 107);
            map.put(257, 108);
            map.put(320, 109);
            map.put(332, 110);
            map.put(345, 111);
            map.put(356, 112);
            map.put(369, 113);
            map.put(419, 114);
            map.put(431, 115);
            map.put(443, 116);
            map.put(455, 117);
            map.put(467, 118);
            map.put(530, 119);
            map.put(542, 120);
            map.put(554, 121);
            map.put(566, 122);
            map.put(578, 123);
            map.put(629, 124);
            map.put(641, 125);
            map.put(653, 126);
            map.put(665, 127);
            map.put(677, 128);
            map.put(740, 129);
            map.put(752, 130);
            map.put(764, 131);
            map.put(776, 132);
            map.put(788, 133);
            map.put(839, 134);
            map.put(851, 135);
            map.put(863, 136);
            map.put(875, 137);
            map.put(887, 138);
            map.put(950, 139);
            map.put(962, 140);
            map.put(974, 141);
            map.put(986, 142);
            map.put(998, 143);
            map.put(1000, 144);

            // 가장 가까운 key 이하 중 최대값을 찾음
            Map.Entry<Integer, Integer> entry = map.ceilingEntry(n);
            System.out.println( entry != null ? entry.getValue() : 0);
        }
        
        br.close();
    }
}
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class fivetwentyeightC {
    //hoot 287 寻找重复数
    public int findDuplicate(int[] nums) {
        int slow = 0,falst = 0;
        do{
            slow = nums[slow];
            falst = nums[nums[falst]];
        }while(slow!=falst);
        slow =0;
        Map<Integer,Integer >map = new HashMap<>() ;
        map.geto

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public int get(Object key) {
                return 0;
            }

            @Override
            public int put(int key, int value) {
                return 0;
            }

            @Override
            public int remove(Object key) {
                return 0;
            }

            @Override
            public void putAll(Map<? extends int, ? extends int> m) {

            }

            @Override
            public void clear() {

            }

            @Override
            public Set<int> keySet() {
                return null;
            }

            @Override
            public Collection<int> values() {
                return null;
            }

            @Override
            public Set<Entry<int, int>> entrySet() {
                return null;
            }
        }
        while(slow!=falst){
            slow = nums[slow];
            falst = nums[falst];
        }return slow;
    }
}

//利用数组构建类链表结构
//在利用环形链表II的思路解决

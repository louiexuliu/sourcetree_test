/**
 * Author: Louie Liu
 * Time: 2023/12/12 2:14
 */
class Solution_8 {
    private static final int SIZE = 1000; // 设定数组大小
    private int[] keys;
    private int[] values;

    public Solution_8() {
        keys = new int[SIZE]; // 存放键的数组
        values = new int[SIZE]; // 存放值的数组
    }

    public void put(int key, int value) {
        int index = key % SIZE; // 使用简单的取余方法得到索引
        keys[index] = key; // 将键存入数组对应位置
        values[index] = value; // 将值存入数组对应位置
    }

    public int get(int key) {
        int index = key % SIZE;
        if (keys[index] == key) {
            return values[index];
        }
        return -1;
    }

    public void remove(int key) {
        int index = key % SIZE; //得到索引
        if (keys[index] == key) {
            keys[index] = 0; // 将键置为0表示删除
            values[index] = 0;
        }
    }


    public static void main(String[] args) {
            Solution_8 Solution_8 = new Solution_8();
            Solution_8.put(1, 1);
            Solution_8.put(2, 2);
            System.out.println(Solution_8.get(1));
            System.out.println(Solution_8.get(3));
            Solution_8.put(2, 1);
            System.out.println(Solution_8.get(2));
            Solution_8.remove(2);
            System.out.println(Solution_8.get(2));
    }


}
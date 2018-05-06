package javaCoreT.javaCoreT_01;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

/**
 * Created by longguangbin on 2018/5/5.
 */

class Node1 {                                                   // 1、简单的单向链表
    private String data;
    private Node1 next;

    public Node1(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setNext(Node1 next) {
        this.next = next;
    }

    public Node1 getNext() {
        return next;
    }
}

class Node2 {                                                   // 2、基础链表功能，添加、打印
    private String data;
    private Node2 next;

    public Node2(String data) {
        this.data = data;
    }

    public String getData() {
        return this.data;
    }

    public void setNext(Node2 next) {
        this.next = next;
    }

    public Node2 getNext() {
        return this.next;
    }

    public void addNode(Node2 node2) {
        if (this.getNext() != null) {
            this.getNext().setNext(node2);
        } else {
            this.setNext(node2);
        }
    }

    public void printNode() {
        System.out.println(getData());
        if (this.getNext() != null) {
            this.getNext().printNode();
        }
    }
}

class Link2 {                                                   // 2、基础链表功能，添加、打印
    private Node2 root;

    public void add(String data) {
        if (data == null) {
            return;
        }
        Node2 node2 = new Node2(data);
        if (this.root == null) {
            this.root = node2;
        } else {
            this.root.addNode(node2);
        }
    }

    public void print() {
        if (this.root != null) {
            this.root.printNode();
        }
    }
}

class Link3 {
    private class Node3 {
        private String data;
        private Node3 next;

        public Node3(String data) {
            this.data = data;
        }

        public void addNode(Node3 new_node) {
            if (this.next == null) {
                this.next = new_node;
            } else {
                this.next.addNode(new_node);
            }
        }

        public boolean containNode(String data) {               // 查找数据
            if (data.equals(this.data)) {
                return true;
            } else {
                if (this.next != null) {
                    return this.next.containNode(data);
                } else {
                    return false;
                }
            }
        }

        public void removeNode(Node3 previous, String data) {   // 删除数据。传入前一个节点，数据
            if (data.equals(previous.next.data)) {
                previous.next = this.next;
            } else {
                this.next.removeNode(this, data);
            }
        }

        public void toArrayNode() {                              // 读取数据。居然可以这样！
            Link3.this.resData[Link3.this.foot++] = this.data;  // 感觉违背我的编程理念。很乱！
            if (this.next != null) {
                this.next.toArrayNode();
            }
        }

        public String getNode(int index) {
            if (Link3.this.foot++ == index) {
                return this.data;
            } else {
                return this.next.getNode(index);
            }
        }
    }

    private Node3 root;
    private int count = 0;                                      // 用于计数
    private int foot = 0;                                       // 用于index
    private String[] resData;                                   // 用于取数据
    private boolean changeFlag = true;

    public boolean add(String data) {                           // 添加一个
        if (data == null) {                                     // 空数据
            return false;
        }
        Node3 new_node = new Node3(data);
        if (this.root == null) {
            this.root = new_node;
        } else {
            this.root.addNode(new_node);
        }
        this.count++;                                           // 添加成功，增加一个计数
        this.changeFlag = true;
        return true;
    }

    public boolean addAll(String[] data_list) {                 // 添加所有的
        for (int i = 0; i < data_list.length; i++) {
            if (!this.add(data_list[i])) {
                return false;
            }
        }
        return true;
    }

    public int size() {                                          // 返回计数
        return this.count;
    }

    public boolean isEmpty() {                                  // 判断是否为空
        return this.count == 0;
    }

    public boolean contain(String data) {                       // 查找数据
        if (this.root == null || data == null) {
            return false;
        }
        return this.root.containNode(data);
    }

    public void remove(String data) {
        if (!this.contain(data)) {                              // 要删除的数据不存在
            return;
        }
        if (data.equals(this.root.data)) {                      // 要删除的数据是根节点的数据
            this.root = this.root.next;
        } else {
            this.root.next.removeNode(this.root, data);         // 下一个节点
        }
        this.changeFlag = true;
        this.count--;
    }

    public String[] toArray() {
        if (this.count == 0) {
            return null;                                            // 可以返回null
        }
        if (this.changeFlag) {
            this.foot = 0;
            this.resData = new String[this.count];
            this.root.toArrayNode();
            this.changeFlag = false;
        }
        return this.resData;
    }

    public String get(int index) {
        if (index > this.count) {
            return null;
        }
        this.foot = 0;
        return this.root.getNode(index);
    }

    public void clear() {
        this.root = null;
        this.count = 0;
    }

    public void print() {
        String[] tmp = this.toArray();
        System.out.print("[");
        for (int i = 0; i < (tmp.length - 1); i++) {
            System.out.print("\"" + tmp[i] + "\", ");
        }
        System.out.println("\"" + tmp[tmp.length - 1] + "\"]");
    }
}

public class javaLinkedList {
    //    learn:
    //    1、简单的单向链表
    //    2、基础链表功能，添加、打印
    //    3、链表。
    public static void simpleLinkedList1() {                    // 1、简单的单向链表
        Node1 node1 = new Node1("火车头");
        Node1 node2 = new Node1("车厢1");
        Node1 node3 = new Node1("车厢2");
        node1.setNext(node2);
        node2.setNext(node3);
        Node1 current_node = node1;
        while (current_node != null) {
            System.out.println(current_node.getData());
            current_node = current_node.getNext();
        }
    }

    public static void simpleLinkedList2() {                    // 2、基础链表功能，添加、打印
        Link2 link2 = new Link2();
        link2.add("火车头");
        link2.add("车厢1");
        link2.add("车厢2");
        link2.print();
    }

    public static void simpleLinkedList3() {                    // 3、链表
        Link3 link3 = new Link3();
        link3.add("火车头");
        link3.add("车厢1");
        link3.add("车厢2");
        link3.print();
        String[] data_list = {"车厢3", "车厢4", "车厢5"};
        link3.addAll(data_list);
        System.out.println(link3.get(3));
        link3.print();
        System.out.println(link3.contain("车厢3"));
        link3.remove("车厢3");
        System.out.println(link3.contain("车厢3"));
        System.out.println(link3.get(3));
        link3.print();
    }

    public static void main(String[] args) {
        System.out.println("====================== simpleLinkedList1 ======================");
        simpleLinkedList1();                                  // 1、简单的单向链表
        System.out.println("====================== simpleLinkedList2 ======================");
        simpleLinkedList2();                                  // 2、基础链表功能，添加、打印
        System.out.println("====================== simpleLinkedList3 ======================");
        simpleLinkedList3();                                  // 3、链表
    }
}

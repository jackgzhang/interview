package weivretni.leetcode.summary;//package weivretni.leetcode.summary;
//
//import junit.framework.Assert;
//
//import org.junit.Test;
//
//import weivretni.BaseTest;
//import weivretni.ListNode;
//
//public class LinkListRelated_Test extends BaseTest {
//
//    private LinkListRelated source = new LinkListRelated();
//
//    @Test
//    public void test() {
//
//        // 1. 求单链表中结点的个数: getListLength
//        Assert.assertEquals(4, source.getListLength(this.getListNode(new int[] { 1, 2, 3, 4, })));
//        Assert.assertEquals(1, source.getListLength(this.getListNode(new int[] { 1 })));
//
//        // 2. 翻转链表（递归)
//        System.out.println(source.reverseList(this.getListNode(new int[] { 1, 2, 3, 4, })));
//
//        // 2. 翻转链表（递归)
//        System.out.println(source.reverseList2(this.getListNode(new int[] { 1, 2, 3, 4, })));
//        System.out.println(source.reverseList2(this.getListNode(new int[] { 1, 2, 3, 4, 5, 6 })));
//
//        // 3. 查找单链表中的倒数第K个结点（k > 0）
//        Assert.assertEquals(4, source.reGetKthNode(this.getListNode(new int[] { 1, 2, 3, 4, 5, 6 }), 4).val);
//
//        // 4. 查找单链表的中间结点
//        Assert.assertEquals(3, source.getMiddleNode(this.getListNode(new int[] { 1, 2, 3, 4, 5 })).val);
//
//        // 5. 从尾到头打印单链表: reversePrintListStack
//        source.reversePrintListStack(this.getListNode(new int[] { 1, 2, 3, 4, 5 }));
//
//        // 5. 从尾到头打印单链表: reversePrintListRec
//        source.reversePrintListRec(this.getListNode(new int[] { 1, 2, 3, 4, 5 }));
//
//        // 6. 合并成一个链表依然有序
//        System.out.println("");
//        System.out.println(source.mergeSortedList(this.getListNode(new int[] { 1, 2, 3, 4, 5 }), this.getListNode(new int[] { 6, 7, 8 })));
//        System.out.println(source.mergeSortedListRec(this.getListNode(new int[] { 1, 2, 3, 4, 5 }), this.getListNode(new int[] { 6, 7, 8 })));
//
//        //  7. 判断一个单链表中是否有环: hasCycle
//        ListNode node = this.getListNode(new int[] { 1, 2, 3, 4, 5 });
//        Assert.assertEquals(false, source.hasCycle(node));
//
//        // 11. 给出一单链表头指针pHead和一节点指针pToBeDeleted
//        source.delete(node, node);
//        System.out.println(node);
//    }
//}

package weivretni.microsoft;

/**
 * <pre>
 * 26.左旋转字符串
 * 
 * 题目：
 * 定义字符串的左旋转操作：把字符串前面的若干个字符移动到字符串的尾部。
 * 
 * 如把字符串abcdef左旋转2位得到字符串cdefab。请实现字符串左旋转的函数。
 * 要求时间对长度为n的字符串操作的复杂度为O(n)，辅助内存为O(1)。
 * </pre>
 * 
 * 
 * http://blog.csdn.net/v_july_v/article/details/6322882
 * 
 * <pre>
 * 三步翻转法
 * 
 * ,就拿abcdef 这个例子来说，若要让def翻转到abc的前头，那么只要按下述3个步骤操作即可：
 * 1、首先分为俩部分，X:abc，Y:def；
 * 2、X->X^T，abc->cba， Y->Y^T，def->fed。
 * 3、(X^TY^T)^T=YX，cbafed->defabc，即整个翻转。
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class MS26 {

}

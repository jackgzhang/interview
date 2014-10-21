package weivretni.microsoft;

import java.util.Stack;

/**
 * <pre>
 * 
 * 2.设计包含min函数的栈。 定义栈的数据结构，要求添加一个min函数，能够得到栈的最小元素。 要求函数min、push以及pop的时间复杂度都是O(1)。
 * 
 * 2. Answer.
 *  Use 2 stack,  1 stack keep all the numbers;  Another stack keep all the current min mumbers:
 * 
 * Say, we want push 2,6,4,1,5.
 * 
 * 
 *   Stack 1:            Stack 2
 *      5                   1
 *      1                   1
 *      4                   2
 *      6                   2
 *      2                   2
 *      
 * <pre/>
 * 
 * @author gzhang
 * 
 */
public class MS02 {
    
    
}

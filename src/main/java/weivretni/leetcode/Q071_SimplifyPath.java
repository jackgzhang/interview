package weivretni.leetcode;

import java.util.Stack;

/**
 * <pre>
 * Given an absolute path for a file (Unix-style), simplify it.
 * 
 * For example,
 * path = "/home/", => "/home"
 * path = "/a/./b/../../c/", => "/c"
 * 
 * Corner Cases:
 * Did you consider the case where path = "/../"?
 * In this case, you should return "/".
 * Another corner case is the path might contain multiple slashes '/' together, such as "/home//foo/".
 * In this case, you should ignore redundant slashes and return "/home/foo".
 * </pre>
 * 
 * @author gzhang
 *
 */
public class Q071_SimplifyPath {

    public String simplifyPath(String path) {
        if (path == null || path.length() == 0) {
            return path;
        } else {
            Stack<String> paths = new Stack<String>();
            String[] segments = path.split("/");
            for (String s : segments) {
                if (s.equals(".")) {
                    continue;
                } else if (s.equals("..")) {
                    if (!paths.isEmpty())
                        paths.pop();
                } else if (s.length() > 0) {
                    paths.push(s);
                }
            }

            String result = "";
            if (paths.isEmpty()) {
                result = "/";
            } else {
                while (!paths.isEmpty()) {
                    String s = paths.pop();
                    result = "/" + s + result;
                }
            }

            return result;
        }
    }
}

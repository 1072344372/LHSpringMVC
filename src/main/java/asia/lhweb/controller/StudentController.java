package asia.lhweb.controller;

import asia.lhweb.lhspringmvc.servlet.annotation.Controller;
import asia.lhweb.lhspringmvc.servlet.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 学生控制器
 *
 * @author 罗汉
 * @date 2023/09/06
 */
@Controller
public class StudentController {
    @RequestMapping(value = "/student/list")
    public void listStudent(HttpServletRequest request, HttpServletResponse response) {
            response.setContentType("text/html;charset=UTF-8");
        try {
            response.getWriter().write("学生：张三");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

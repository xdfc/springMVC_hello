package fc.study.controller;

import fc.study.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;

@Controller
public class JsonController {

    @RequestMapping("/json")
    @ResponseBody
    public ArrayList<Student> json(){
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student(1,"fang","男"));
        arrayList.add(new Student(2,"cheng","女"));
        arrayList.add(new Student(3,"zhang","男"));
        return arrayList;
    }
}

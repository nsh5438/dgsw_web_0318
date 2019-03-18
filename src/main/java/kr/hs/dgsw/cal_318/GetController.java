package kr.hs.dgsw.cal_318;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {

    @Autowired
    private CalService cs;

    @GetMapping("/cal/{num1}/{num2}/{operate}")
    public int cal(@PathVariable int num1, @PathVariable int num2, @PathVariable String operate){
        return cs.cal_result(num1, num2, operate);
    }
}

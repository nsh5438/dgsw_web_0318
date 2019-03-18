package kr.hs.dgsw.cal_318;

import org.springframework.stereotype.Service;

@Service
public class CalServicein implements CalService {

    @Override
    public int cal_result(int n1, int n2, String s) {
        if (s.equals("plus")) {
            return n1 + n2;
        } else if (s.equals("minus")) {
            return n1 - n2;
        } else if (s.equals("multi")) {
            return n1 * n2;
        } else if (s.equals("division")) {
            return n1 / n2;
        } else {
            return 0;
        }
    }
}


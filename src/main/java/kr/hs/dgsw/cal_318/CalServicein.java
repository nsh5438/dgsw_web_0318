package kr.hs.dgsw.cal_318;

import org.springframework.stereotype.Service;

@Service
public class CalServicein implements CalService {

    @Override
    public int cal_result(int num1, int num2, String operate) {
        if (operate.equals("plus")) {
            return num1 + num2;
        } else if (operate.equals("minus")) {
            return num1 - num2;
        } else if (operate.equals("multi")) {
            return num1 * num2;
        } else if (operate.equals("division")) {
            return num1 / num2;
        } else {
            return 0;
        }
    }
}


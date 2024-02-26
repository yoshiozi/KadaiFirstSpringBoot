package com.techacademy;

import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class KadaiFirstController {

        @GetMapping("dayofweek/{designatedDate}")
        public String dispDayOfWeek(@PathVariable String designatedDate) {
            String str = designatedDate;
            String year = str.substring(0, 4);
            String month = str.substring(4, 6);
            String date = str.substring(6, 8);

            //カレンダーの日時設定
            Calendar cl = Calendar.getInstance();
            cl.set(Integer.parseInt(year),Integer.parseInt(month)-1,Integer.parseInt(date));

            //曜日の取得と指定文字への置換
            int dayOfWeek= cl.get(Calendar.DAY_OF_WEEK);
            String[] weekDays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" } ;

            //曜日の出力
            return "実行結果:" + weekDays[dayOfWeek];
        }


      //課題２
        @GetMapping("/plus/{val1}/{val2}")
        public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
            int res = 0;
            res = val1 + val2;
            return "計算結果：" + res;
        }

        @GetMapping("/minus/{val1}/{val2}")
        public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
            int res = 0;
            res = val1 - val2;
            return "計算結果：" + res;
    }
        @GetMapping("/times/{val1}/{val2}")
        public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
            int res = 0;
            res = val1 * val2;
            return "計算結果：" + res;
    }
        @GetMapping("/divide/{val1}/{val2}")
        public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
            int res = 0;
            res = val1 / val2;
            return "計算結果：" + res;
    }
}



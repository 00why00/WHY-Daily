package com.why.whydaily.ui.diary;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Calendar;

/**
 * @author WHY
 */
public class DiaryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    /**
     * 获取当前系统时间
     * @return 一个包含年月日的数组
     */
    private static String[] getDate(){
        String[] curDate = new String[7];
        Calendar date = Calendar.getInstance();
        curDate[0] = String.valueOf(date.get(Calendar.YEAR));
        curDate[1] = String.valueOf(date.get(Calendar.MONTH));
        curDate[2] = String.valueOf(date.get(Calendar.DATE));
        curDate[3] = String.valueOf(date.get(Calendar.HOUR_OF_DAY));
        curDate[4] = String.valueOf(date.get(Calendar.MINUTE));
        curDate[5] = String.valueOf(date.get(Calendar.SECOND));
        curDate[6] = String.valueOf(date.get(Calendar.DAY_OF_WEEK));
        switch (curDate[6]){
            case "1":
                curDate[6] = "一";
                break;
            case "2":
                curDate[6] = "二";
                break;
            case "3":
                curDate[6] = "三";
                break;
            case "4":
                curDate[6] = "四";
                break;
            case "5":
                curDate[6] = "五";
                break;
            case "6":
                curDate[6] = "六";
                break;
            case "7":
                curDate[6] = "日";
                break;
            default:
                break;
        }
        return curDate;
    }

    public DiaryViewModel() {
        String[] date = getDate();
        mText = new MutableLiveData<>();
        mText.setValue("今天是"+date[0]+"年"+date[1]+"月"+date[2]+"日"
                +"\n"+date[3]+"时"+date[4]+"分"+date[5]+"秒"
                +"\n"+"星期"+date[6]);
    }

    public LiveData<String> getText() {
        return mText;
    }
}
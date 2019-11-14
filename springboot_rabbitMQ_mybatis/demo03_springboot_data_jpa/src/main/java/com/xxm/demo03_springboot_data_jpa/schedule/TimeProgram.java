package com.xxm.demo03_springboot_data_jpa.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Program: IntelliJ IDEA springboot_demo01
 * @Description: TODO
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-11-11 13:09:23 周一
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */
@Component
public class TimeProgram {

    /**
     * 掌握：cron表达式是一个字符串，字符串以5或6个空格隔开，分开共6或7个域，每一个域代表一个含义
     *  [秒] [分] [小时] [日] [月] [周] [年]
     *  [年]不是必须的域，可以省略[年]，则一共6个域
     *
     * 了解：
     *  fixedDelay：上一次执行完毕时间点之后多长时间再执行（单位：毫秒）
     *  fixedDelayString：同等，唯一不同的是支持占位符，在配置文件中必须有time.fixedDelay=5000
     *  fixedRate：上一次开始执行时间点之后多长时间再执行
     *  fixedRateString：同等，唯一不同的是支持占位符
     *  initialDelay：第一次延迟多长时间后再执行
     *  initialDelayString：同等，唯一不同的是支持占位符
     */

    //    @Scheduled(fixedDelay = 5000)
    //    @Scheduled(fixedDelayString = "5000")
    //    @Scheduled(fixedDelayString = "${time.fixedDelay}")
    //    @Scheduled(fixedRate = 5000)
    //    // 第一次延迟1秒后执行，之后按fixedRate的规则每5秒执行一次
    //    @Scheduled(initialDelay=1000, fixedRate=5000)

    /*通配符说明:
       * 表示所有值. 例如:在分的字段上设置 "*",表示每一分钟都会触发。

       ? 表示不指定值。使用的场景为不需要关心当前设置这个字段的值。

       例如:要在每月的10号触发一个操作，但不关心是周几，所以需要周位置的那个字段设置为"?" 具体设置为 0 0 0 10 * ?

       - 表示区间。例如 在小时上设置 "10-12",表示 10,11,12点都会触发。

       , 表示指定多个值，例如在周字段上设置 "MON,WED,FRI" 表示周一，周三和周五触发

       / 用于递增触发。如在秒上面设置"5/15" 表示从5秒开始，每增15秒触发(5,20,35,50)。 在月字段上设置'1/3'所示每月1号开始，每隔三天触发一次。

       L 表示最后的意思。在日字段设置上，表示当月的最后一天(依据当前月份，如果是二月还会依据是否是润年[leap]), 在周字段上表示星期六，相当于"7"或"SAT"。如果在"L"前加上数字，则表示该数据的最后一个。例如在周字段上设置"6L"这样的格式,则表示“本月最后一个星期五"

       W 表示离指定日期的最近那个工作日(周一至周五). 例如在日字段上设置"15W"，表示离每月15号最近的那个工作日触发。如果15号正好是周六，则找最近的周五(14号)触发, 如果15号是周未，则找最近的下周一(16号)触发.如果15号正好在工作日(周一至周五)，则就在该天触发。如果指定格式为 "1W",它则表示每月1号往后最近的工作日触发。如果1号正是周六，则将在3号下周一触发。(注，"W"前只能设置具体的数字,不允许区间"-").

       # 序号(表示每月的第几个周几)，例如在周字段上设置"6#3"表示在每月的第三个周六.注意如果指定"#5",正好第五周没有周六，则不会触发该配置(用在母亲节和父亲节再合适不过了) ；*/
    @Scheduled(cron = "02/1 14 13 11 11 *")
    public void myTask(){
        System.out.println("程序执行了");
    }
}
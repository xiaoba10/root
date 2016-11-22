package Package126;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



/**
 * Created by wangzunwen on 2016/11/18.
 */
public class maxPoints {

    public static void main(String[] args){

        Point[] points = new Point[5];
        points[0] = new Point(-4,-4);
        points[1] = new Point(-8,-582);
        points[2] = new Point(-3,3);
        points[3] = new Point(-9,-651);
        points[4] = new Point(9,591);



        System.out.println(maxPoints.maxPoints(points));

    }

    

    public static int maxPoints(Point[] points) {


        if (points.length < 3) return points.length;
        
        int max = 0;//用于返回的结果，即共线点的最大个数
        Map<Double, Integer> map = new HashMap<Double, Integer>();//保存同一个斜率的点的个数
        
        for (int i = 0; i < points.length; i++) {//以每一个点为固定点
            map.clear();
            int duplicate = 1;//记录跟固定点重合的个数
            
            for(int j = i+1 ; j < points.length; j++){//遍历其他点，求其与固定点之间的斜率
                double slope = 0.0;//斜率
                
                if (points[i].x == points[j].x && points[i].y == points[j].y) {//如果跟固定点重合
                    duplicate++;
                    continue;
                } else if (points[i].x == points[j].x) {//如果跟固定点在同一条竖线上，斜率设为最大值
                    slope = Integer.MAX_VALUE;
                } else if( points[i].y == points[j].y ){//计算该点与固定点的斜率
                    slope = 0;
                } else{
                    slope = 1.0 * (points[i].y - points[j].y) / (points[i].x - points[j].x);
                }
                map.put(slope, map.containsKey(slope) ? map.get(slope) + 1 : 1);
            }
            
            //更新最优解
            if (map.keySet().size() == 0) {//如果map为空
                max = duplicate > max ? duplicate : max;
            } else {
                for (double key : map.keySet()) {
                    max = Math.max((duplicate + map.get(key)), max); 
                }
            }
        }
        return max;
    

    }
}

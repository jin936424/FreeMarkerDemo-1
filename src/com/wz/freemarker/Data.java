package com.wz.freemarker;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 模拟数据源
 * @author Miller
 *
 */
public class Data {
	public static List<News> newses = new ArrayList<>();
	static{
		newses.add(new News(1, "2016凤凰·鼓浪屿诗歌节", new Date(), "小张"));
		newses.add(new News(2, "“春天读诗之夜”诗歌朗诵会", new Date(), "小张"));
		newses.add(new News(3, "2016《春天读诗·第三季》", new Date(), "小张"));
		newses.add(new News(4, "著名文学家、翻译家杨绛逝世", new Date(), "小张"));
		newses.add(new News(5, "木心纪录片《归来的局外人》", new Date(), "小张"));
		newses.add(new News(6, "最有专业的全方位军事话题平台", new Date(), "小张"));
		newses.add(new News(7, "2015《春天读诗·第二季》", new Date(), "小张"));
		newses.add(new News(8, "2015春节特献：年画里的黄金时代", new Date(), "小张"));
		newses.add(new News(9, "马尔克斯逝世：大师百年 人类孤独", new Date(), "小张"));
		newses.add(new News(10, "2014诺贝尔文学奖：法国新寓言派莫迪亚诺", new Date(), "小张"));
		newses.add(new News(11, "2014《春天读诗·第一季》", new Date(), "小张"));
		newses.add(new News(12, "《送行者》：中国殡仪馆影像记录", new Date(), "小张"));
		newses.add(new News(13, "《好久不见》：王小波 史铁生 海子", new Date(), "小张"));
		newses.add(new News(14, "全民摄影热此起彼伏，很多人把镜头对准了身边人和事", new Date(), "小张"));
		newses.add(new News(15, "孤独狂野大师森山大道：让摄影给自己一个在路上的理由", new Date(), "小张"));
		newses.add(new News(16, "齐白石晚年透露：与吴昌硕的“交往”与“恩怨”", new Date(), "小张"));
		newses.add(new News(17, "杀马特的逆袭：尬文化如何“尬”得怡然自得", new Date(), "小张"));
		newses.add(new News(18, "弗州暴力冲突：美国“新纳粹”作为政治力量正式登场？", new Date(), "小张"));
	}
}

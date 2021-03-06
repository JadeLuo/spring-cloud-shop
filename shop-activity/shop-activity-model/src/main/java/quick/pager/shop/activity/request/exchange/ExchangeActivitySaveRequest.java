package quick.pager.shop.activity.request.exchange;

import java.time.LocalDateTime;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import quick.pager.shop.request.Request;

/**
 * 满赠换购SaveRequest
 *
 * @author siguiyang
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ExchangeActivitySaveRequest extends Request {

    private static final long serialVersionUID = -2139790759429948078L;

    /**
     * 活动名称
     */
    private String activityName;

    /**
     * 活动图片
     */
    private String activityImg;

    /**
     * 周期
     */
    private List<LocalDateTime> timeRange;

}

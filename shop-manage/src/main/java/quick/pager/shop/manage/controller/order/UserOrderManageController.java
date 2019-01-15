package quick.pager.shop.manage.controller.order;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import quick.pager.common.constants.Constants;
import quick.pager.common.response.Response;
import quick.pager.shop.manage.client.OrderClient;
import quick.pager.shop.model.feign.request.OrderRequest;

/**
 * 用户订单管理
 *
 * @author siguiyang
 */
@Api(description = "用户订单管理")
@RestController
@RequestMapping(Constants.Module.MANAGE)
public class UserOrderManageController {

    @Autowired
    private OrderClient orderClient;

    @ApiOperation("用户订单列表")
    @PostMapping("/order/user")
    public Response order(OrderRequest request) {
        return orderClient.orders(request);
    }

    @ApiOperation("用户订单详情")
    @PostMapping("/order/user/info")
    public Response orderInfo(@RequestParam("orderId") Long orderId) {
        return orderClient.orderInfo(orderId);
    }
}

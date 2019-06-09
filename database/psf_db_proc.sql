
CREATE DEFINER=`root`@`localhost` PROCEDURE `order_procedure`(in email varchar(254), 
                                            in product_name varchar(100), 
                                            in payment varchar(250),
                                            in quantity tinyint,
                                            in order_num int)
BEGIN
    
    declare _order_price double(8,2);
    declare product_id bigint;
    declare price double(7,2);
    declare order_price double(8,2);
    
    select id_prod, prod_price into product_id, price from products where products.prod_name = product_name;
   
    set order_price = price * quantity;
    
    insert into `order`(ORDER_PRICE, PAYMENT, QUANTITY, ORDER_NUM, PRODUCTS_ID_PROD)
    values(order_price, payment, quantity, order_num, product_id);
    
END


CREATE PROCEDURE `additions_procedure_premium` (
                                            in product_name varchar(100), 
                                            in order_num int,
                                            in addition_name varchar(100))
BEGIN
    declare _order_price double(8,2);
    declare product_id bigint;
    declare _addition_id varchar(100);
    declare _id_order bigint;
    
    
    select products.id_prod into product_id from products where products.prod_name = product_name;
    select `order`.id_order into _id_order from `order` where `order`.order_num = order_num;
    select additions.id_add into _addition_id from `additions` where additions.add_name = addition_name;
    
    
    insert into `order_has_additions`(ORDER_ID_ORDER, ORDER_PRODUCTS_ID_PROD, ADDITIONS_ID_ADD)
    values(_id_order, product_id, _addition_id);
    
END

CREATE DEFINER=`root`@`localhost` PROCEDURE `complete_order_procedure`(in order_num int,
                                            in user_mail varchar(254)
                                            )
BEGIN
    
    declare _points smallint;
    declare _montly_orders smallint;
    declare _id_user bigint;
    declare _total_price double(9,2);
    declare total_order_price double(8,2);
    declare total_add_price double(5,2);
    declare _id_order bigint;
    
    
    select id_user into _id_user from users where users.email = user_mail;
    
    select id_order into _id_order from `order` where `order`.order_num = order_num;
    
    select sum(`order`.order_price) into total_order_price from `order` where `order`.order_num = order_num;
    select sum(`additions`.add_price) into total_add_price 
    from additions, order_has_additions
    where 
        order_has_additions.order_id_order = _id_order
        and
        order_has_additions.additions_id_add = additions.id_add;
    
    set _total_price = total_order_price + total_add_price;
   
    insert into orders (USERS_ID_USER, TOTAL_PRICE, ORDERS_ORDER_NUM)
    values(_id_user, _total_price, order_num);
    
    update users
    set points = ROUND(_total_price) / 100,
    monthly_orders = monthly_orders + 1
    where users.email = user_mail;

END







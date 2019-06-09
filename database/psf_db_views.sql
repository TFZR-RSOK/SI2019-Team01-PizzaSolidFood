USE `psf_db`;
CREATE  OR REPLACE VIEW `mail` AS
select 
    users.user_name,
    users.user_lastname,
    #users.user_address, not in use
    orders.total_price,
    `order`.date_time,
    `order`.payment,
    `order`.quantity,
    `order`.order_num,
    products.prod_name,
    products.prod_price,
    products.discount_for_premium_users,
    additions.add_name,
    additions.add_price

from users, orders, `order`, products, additions, order_has_additions
where
    users.id_user = orders.users_id_user
    and
    orders.orders_order_num = `order`.order_num
    and
    `order`.id_order = products.id_prod
    and
    `order`.id_order = order_has_additions.order_id_order
    and
    additions.id_add = order_has_additions.additions_id_add;;

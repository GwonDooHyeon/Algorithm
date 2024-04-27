-- 코드를 입력하세요

# 7월 촐 주문량
with july as (
    SELECT
        shipment_id
        ,flavor
        ,sum(total_order) as total_order
    from july
    group by flavor
) 
select 
    f.flavor
from first_half f
    inner join july on f.SHIPMENT_ID = july.SHIPMENT_ID
order by f.total_order + july.total_order desc
limit 3;
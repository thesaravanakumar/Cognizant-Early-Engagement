select user_id, count(bd_id) as `no_of_times`
from bookingdetails
group by user_id asc;
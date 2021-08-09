select distinct s1.bus_no,
    b.bus_name
from schedule s1
    inner join schedule s2 on s1.source = s2.destination
    and s1.destination = s2.source
    inner join buses b on s1.bus_no = b.bus_no
order by s1.bus_no;

select distinct s1.bus_no,
    b.bus_name
from schedule s1,
    schedule s2,
    buses b
where s1.source = s2.destination
    and s1.destination = s2.source
    and s1.bus_no = b.bus_no
order by s1.bus_no;
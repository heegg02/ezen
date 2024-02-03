#select abs(-50);

#select ceiling(4.3);
#select floor(4.7);
#select round(4.7);

#select mod(10, 3);

#select pow(2, 3);


#select rand();

#select truncate(1234.12);
#select truncate(1234.12 ,1);
#select truncate(1234, -2);

#select adddate('2024-01-02', interval 1 month);
#select adddate(curdate(), interval 100 day);

#select subdate('2024-01-02', interval 1 month);
#select subdate(curdate(), interval 100 day);

#select curdate();
#select sysdate();
#select now();
#select date(now());
#select time(now());

#select datediff('2025-05-20', now());
#select last_day('2024-02-01');
#select makedate(2024, 35);
#select quarter('2024-08-20');
#select time_to_sec('15:45:20');
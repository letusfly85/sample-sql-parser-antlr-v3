select name n ,address a ,tel t ,@myvar, job
from
	 users
	,employees
where
	a = 2
and b = 1
and c between 1 and 5
and d is not null

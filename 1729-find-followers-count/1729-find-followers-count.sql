# Write your MySQL query statement below
#SELECT user_id,count(follower_id) as followers_count FROM Followers where follower_id = user_id;

select user_id, COUNT(follower_id) as followers_count from Followers GROUP BY user_id ORDER BY user_id ASC
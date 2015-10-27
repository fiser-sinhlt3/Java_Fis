SELECT U1.name, U2.name
FROM (user U1 join user U2) join lover L
WHERE U1.id = L.id1 AND U2.id = L.id2;
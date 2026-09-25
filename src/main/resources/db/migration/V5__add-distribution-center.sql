ALTER TABLE product ADD COLUMN distribution_center VARCHAR(20);

-- joguei os produtos do seed em centros diferentes pra nao ficar tudo no mesmo
UPDATE product SET distribution_center = 'RJ' WHERE category = 'clothes';
UPDATE product SET distribution_center = 'SP' WHERE category = 'electronics';
UPDATE product SET distribution_center = 'MG' WHERE category = 'home';

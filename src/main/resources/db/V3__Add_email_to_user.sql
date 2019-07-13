ALTER TABLE `user` 
ENGINE = InnoDB ,
ADD COLUMN `email` VARCHAR(45) NULL AFTER `user_name`;

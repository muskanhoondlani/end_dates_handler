CREATE TABLE `appliance` (
  `id` bigint(20) NOT NULL,
  `appliance_name` varchar(255) DEFAULT NULL,
  `appliance_price` varchar(255) DEFAULT NULL,
  `appliance_service` varchar(255) DEFAULT NULL,
  `appliance_spec` varchar(255) DEFAULT NULL,
  `appliance_warranty` varchar(255) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKiyqirji6xca9te5v346kjmiyn` (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

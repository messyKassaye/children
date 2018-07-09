# children
this project is aimed to solve children management system for NGO's which are working on childrens.
The project is developed using JEE and development tool is NetBeans

Database
-----------
CREATE TABLE `attachment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(45) DEFAULT NULL,
  `title` varchar(145) DEFAULT NULL,
  `name` varchar(1145) DEFAULT NULL,
  `remark` text,
  `date` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `child_id` int(11) DEFAULT NULL,
  `by` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



CREATE TABLE `backup_time` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `by` int(11) DEFAULT NULL,
  `date` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



CREATE TABLE `comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `child_id` int(11) DEFAULT NULL,
  `by` int(11) DEFAULT NULL,
  `comment` text,
  `date` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `comment_child_idx` (`child_id`),
  KEY `comment_by_fk_idx` (`by`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



CREATE TABLE `config` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `value` varchar(100) DEFAULT NULL,
  `description` text,
  `status` varchar(5) DEFAULT 'ON',
  `time_stamp` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `departments` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `default_url` varchar(45) DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  `time_stamp` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



CREATE TABLE `grant_task` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `task_id` int(11) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  `modify_content` varchar(45) DEFAULT NULL,
  `view_content` varchar(45) DEFAULT NULL,
  `by` int(11) DEFAULT NULL,
  `timestamp` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `grant_task_task_fk_idx` (`task_id`),
  KEY `grant_task_role_fk_idx` (`role_id`),
  KEY `grand_task_by_idx` (`by`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `information` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `term` varchar(20) DEFAULT NULL,
  `year` year(4) DEFAULT NULL,
  `child_id` varchar(20) DEFAULT NULL,
  `first_name` varchar(45) DEFAULT NULL,
  `middle_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `sex` varchar(45) DEFAULT NULL,
  `birth_certificate` varchar(45) DEFAULT NULL,
  `birth_date` date DEFAULT NULL,
  `height` float DEFAULT NULL,
  `weight` float DEFAULT NULL,
  `religion` varchar(45) DEFAULT NULL,
  `mother_tongue` varchar(45) DEFAULT NULL,
  `second_language` varchar(45) DEFAULT NULL,
  `enrollment_date` date DEFAULT NULL,
  `live_with` varchar(45) DEFAULT NULL,
  `head_of_household` varchar(45) DEFAULT NULL,
  `no_of_brothers` int(11) DEFAULT NULL,
  `no_of_sisters` int(11) DEFAULT NULL,
  `total_no_of_other_family_members` int(11) DEFAULT NULL,
  `total_no_of_household_members` int(11) DEFAULT NULL,
  `father_occupation` text,
  `mother_occupation` text,
  `reason_for_mother_not_at_home` text,
  `reason_for_father_not_at_home` text,
  `guardian_occupation` text,
  `main_family_income` varchar(145) DEFAULT NULL,
  `school_level` varchar(45) DEFAULT NULL,
  `grade` varchar(45) DEFAULT NULL,
  `school_name` varchar(45) DEFAULT NULL,
  `favorite_subject_1` varchar(145) DEFAULT NULL,
  `favorite_subject_2` varchar(145) DEFAULT NULL,
  `favorite_food_1` varchar(145) DEFAULT NULL,
  `favorite_food_2` varchar(145) DEFAULT NULL,
  `extra_curricular_activities` varchar(145) DEFAULT NULL,
  `responsibilities_at_school` varchar(145) DEFAULT NULL,
  `chores_performed_by_child` text,
  `hobbies_1` text,
  `hobbies_2` text,
  `want_to_be` text,
  `health_status` varchar(145) DEFAULT NULL,
  `special_health_need` varchar(145) DEFAULT NULL,
  `community_health_issue` text,
  `distance_to_health_center` varchar(20) DEFAULT NULL,
  `distance_from_school` varchar(20) DEFAULT NULL,
  `transportation_to_school` varchar(145) DEFAULT NULL,
  `family_primary_water_source` varchar(45) DEFAULT NULL,
  `distance_to_water_source` varchar(20) DEFAULT NULL,
  `type_of_house` varchar(45) DEFAULT NULL,
  `latrine` varchar(45) DEFAULT NULL,
  `distance_to_latrine` varchar(20) DEFAULT NULL,
  `program_id` varchar(45) DEFAULT NULL,
  `donor_name` varchar(45) DEFAULT NULL,
  `partner_name` varchar(45) DEFAULT NULL,
  `sponsor_name` varchar(45) DEFAULT NULL,
  `why_assistance_reason_1` text,
  `why_assistance_reason_2` text,
  `child_benefit_1` varchar(145) DEFAULT NULL,
  `child_benefit_2` varchar(145) DEFAULT NULL,
  `child_benefit_3` varchar(145) DEFAULT NULL,
  `family_benefit_1` varchar(145) DEFAULT NULL,
  `family_benefit_2` varchar(145) DEFAULT NULL,
  `other_issue` varchar(45) DEFAULT NULL,
  `date_letter_arrived_from_sponsor` date DEFAULT NULL,
  `type_of_letter` varchar(45) DEFAULT NULL,
  `date_replay_sent_INA` date DEFAULT NULL,
  `recorded_by` varchar(45) DEFAULT NULL,
  `position_of_recorder` varchar(45) DEFAULT NULL,
  `date_this_CPR_recorded` date DEFAULT NULL,
  `is_approved` varchar(45) DEFAULT 'NO',
  `checked_by` varchar(45) DEFAULT NULL,
  `position_of_checker` varchar(45) DEFAULT NULL,
  `date_the_data_checked` date DEFAULT NULL,
  `photo` varchar(145) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



CREATE TABLE `language` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `E` varchar(450) DEFAULT NULL,
  `A` varchar(450) DEFAULT NULL,
  `O` varchar(450) DEFAULT NULL,
  `time_stamp` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `lookup` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(450) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  `by` varchar(59) DEFAULT NULL,
  `time_stamp` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



CREATE TABLE `notes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user` int(11) DEFAULT NULL,
  `note` text,
  `date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `notes_user_fk_idx` (`user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `photo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `child_id` int(11) DEFAULT NULL,
  `description` text,
  `picture` varchar(145) DEFAULT NULL,
  `by` int(11) DEFAULT NULL,
  `date` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `photo_by_fk_idx` (`by`),
  KEY `photo_child_fk_idx` (`child_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `report_term` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `report_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



CREATE TABLE `tasks` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(150) DEFAULT NULL,
  `description` text,
  `status` varchar(45) DEFAULT '1',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name_UNIQUE` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



CREATE TABLE `trigger1` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `land_id` int(11) DEFAULT NULL,
  `u_id` int(11) DEFAULT NULL,
  `tab` varchar(45) NOT NULL,
  `action_type` varchar(45) DEFAULT NULL,
  `current` longtext,
  `old` longtext,
  `by_id` int(11) DEFAULT NULL,
  `computer` varchar(145) DEFAULT NULL,
  `date` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `trigger_by_fk_idx` (`by_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `user_roles` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  `time_stamp` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `user_roles_user_idx` (`user_id`),
  KEY `user_roles_role_fk_idx` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `employee_id` varchar(45) DEFAULT NULL,
  `full_name` varchar(45) NOT NULL,
  `sex` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `username` varchar(100) DEFAULT NULL,
  `password` varchar(450) DEFAULT NULL,
  `temp_pass` varchar(445) DEFAULT NULL,
  `position` varchar(145) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `status` varchar(45) DEFAULT 'Active',
  `by` int(11) DEFAULT NULL,
  `time_stamp` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username_UNIQUE` (`username`),
  KEY `by_fk_idx` (`by`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `video` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `child_id` int(11) DEFAULT NULL,
  `description` text,
  `video` varchar(145) DEFAULT NULL,
  `by` int(11) DEFAULT NULL,
  `date` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `video_by_fk_idx` (`by`),
  KEY `video_child_fk_idx` (`child_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



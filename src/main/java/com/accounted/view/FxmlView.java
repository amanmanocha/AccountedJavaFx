package com.accounted.view;

import java.util.ResourceBundle;

import com.accounted.controller.DepartmentController;
import com.accounted.controller.InitiatorController;
import com.accounted.controller.LoginController;
import com.accounted.controller.MenuBarController;
import com.accounted.controller.UserController;

public enum FxmlView {
	MENUBAR {
		@Override
		public String getTitle() {
			return getStringFromResourceBundle("Menubar");
		}

		@Override
		public String getFxmlFile() {
			return "/fxml/MenuBar.fxml";
		}

		@Override
		public Class getController() {
			return MenuBarController.class;
		}
	},
	DEPARTMENT {
		@Override
		public String getTitle() {
			return getStringFromResourceBundle("department.title");
		}

		@Override
		public String getFxmlFile() {
			return "/fxml/Department.fxml";
		}

		@Override
		public Class getController() {
			return DepartmentController.class;
		}

	},
	INITIATOR {
		@Override
		public String getTitle() {
			return getStringFromResourceBundle("intitiator.title");
		}

		@Override
		public String getFxmlFile() {
			return "/fxml/Initiator.fxml";
		}

		@Override
		public Class getController() {
			return InitiatorController.class;
		}
	},
	LOGIN {
		@Override
		public String getTitle() {
			return getStringFromResourceBundle("login.title");
		}

		@Override
		public String getFxmlFile() {
			return "/fxml/Login.fxml";
		}

		@Override
		public Class getController() {
			return LoginController.class;
		}
	},
	USER {
		@Override
		public String getTitle() {
			return getStringFromResourceBundle("user.title");
		}

		@Override
		public String getFxmlFile() {
			return "/fxml/User.fxml";
		}

		@Override
		public Class getController() {
			return UserController.class;
		}
	};

	public abstract String getTitle();

	public abstract String getFxmlFile();

	public abstract Class getController();

	String getStringFromResourceBundle(String key) {
		return ResourceBundle.getBundle("Bundle").getString(key);
	}

}
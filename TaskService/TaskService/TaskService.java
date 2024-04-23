package TaskService;

import java.util.ArrayList;


	public class TaskService {
		public static ArrayList<Task> Tasks = new ArrayList<>() ;



		public static boolean addTask(Task Task) {

			boolean alreadyTask = false;


			for (Task TaskList : Tasks) {

				if (TaskList.getID().equals(Task.getID())) {

					alreadyTask = true;
					}
				}

			if (!alreadyTask) {

				Tasks.add(Task);
				}

			return alreadyTask;
}


		public static boolean deleteTask(Task Task) {

			for (Task TaskList : Tasks) {

				if (TaskList.getID().equals(Task.getID())) {

					Tasks.remove(Task);

					return true;

				}
}

			return false;
}


		public static boolean updateTask(Task Task) {

			for (Task TaskList : Tasks) {

				if (TaskList.getID().equals(Task.getID())) {

					TaskList.updatreqName(Task.getreqName());

					TaskList.updatereqDesc(Task.getreqDesc());

					return true;
					}
				}

			return false;
}
}
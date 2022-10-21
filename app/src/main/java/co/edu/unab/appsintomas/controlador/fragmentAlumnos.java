package co.edu.unab.appsintomas.controlador;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import co.edu.unab.appsintomas.R;
import co.edu.unab.appsintomas.entities.usuario;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragmentAlumnos#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragmentAlumnos extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ListView listview;
    private ArrayList<usuario> docentelist = new ArrayList<usuario>();
    private ArrayList<String> textos;
    public fragmentAlumnos() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragmentAlumnos.
     */
    // TODO: Rename and change types and number of parameters
    public static fragmentAlumnos newInstance(String param1, String param2) {
        fragmentAlumnos fragment = new fragmentAlumnos();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root=inflater.inflate(R.layout.fragment_alumnos, container, false);
        listview = (ListView) root.findViewById(R.id.listaalumnos);
        usuario user= new usuario(56789,4896,"Steve"
                ,"Jobs","applebest","manzanita2022","CE",46574,
                "https://img1.freepng.es/20171220/vwq/steve-jobs-png-5a3a404a148806.97453834151376698608417047.jpg",
                1,"ALUMNO");

        docentelist.add(user);
        ArrayAdapter<usuario> adapter = new ArrayAdapter<usuario>(getContext(),
                android.R.layout.simple_list_item_1,
                docentelist);
        listview.setAdapter(adapter);


        return root;
    }
}
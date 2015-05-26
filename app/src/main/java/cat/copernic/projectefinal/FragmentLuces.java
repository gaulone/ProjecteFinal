package cat.copernic.projectefinal;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentLuces.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentLuces#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentLuces extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    private Switch entrada,cocina,comedor,salita,habMatr,habD,habM,wc,garaje,patio,escalera,trastero;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment FragmentLuces.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentLuces newInstance(int sectionNumber) {
        FragmentLuces fragment = new FragmentLuces();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public FragmentLuces() {
        // Required empty public constructor
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
                             Bundle savedInstanceState) {View v = inflater.inflate(R.layout.fragment_luces, container, false);

        entrada = (Switch) v.findViewById(R.id.switchEntrada);
        cocina= (Switch) v.findViewById(R.id.switchCocina);
        comedor= (Switch) v.findViewById(R.id.switchComedor);
        salita= (Switch) v.findViewById(R.id.switchSalita);
        habMatr= (Switch) v.findViewById(R.id.switchHabitacionMatr);
        habD= (Switch) v.findViewById(R.id.switchHabitacionD);
        habM= (Switch) v.findViewById(R.id.switchHabitacionM);
        wc= (Switch) v.findViewById(R.id.switchWC);
        garaje= (Switch) v.findViewById(R.id.switchGaraje);
        patio= (Switch) v.findViewById(R.id.switchPatio);
        escalera= (Switch) v.findViewById(R.id.switchEscalera);
        trastero= (Switch) v.findViewById(R.id.switchTrastero);


        entrada.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(getActivity().getApplicationContext(), "Luz entrada ON", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getActivity().getApplicationContext(), "Luz entrada OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cocina.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if(isChecked){
                    Toast.makeText(getActivity().getApplicationContext(),"Luz cocina ON",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getActivity().getApplicationContext(), "Luz cocina OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });

        comedor.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if(isChecked){
                    Toast.makeText(getActivity().getApplicationContext(),"Luz comedor ON",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getActivity().getApplicationContext(), "Luz comedor OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });

        salita.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if(isChecked){
                    Toast.makeText(getActivity().getApplicationContext(),"Luz salita ON",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getActivity().getApplicationContext(), "Luz salita OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });

        habMatr.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if(isChecked){
                    Toast.makeText(getActivity().getApplicationContext(),"Luz habitacion ON",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getActivity().getApplicationContext(), "Luz habitacion OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });

        habD.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(getActivity().getApplicationContext(), "Luz habitacion ON", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getActivity().getApplicationContext(), "Luz habitacion OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });


        habM.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(getActivity().getApplicationContext(), "Luz habitacion ON", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getActivity().getApplicationContext(), "Luz habitacion OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });

        wc.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if(isChecked){
                    Toast.makeText(getActivity().getApplicationContext(),"Luz WC ON",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getActivity().getApplicationContext(), "Luz WC OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });

        garaje.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if(isChecked){
                    Toast.makeText(getActivity().getApplicationContext(),"Luz garaje ON",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getActivity().getApplicationContext(), "Luz garaje OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });

        patio.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(getActivity().getApplicationContext(), "Luz patio ON", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getActivity().getApplicationContext(), "Luz patio OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });
        escalera.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(getActivity().getApplicationContext(), "Luz escalera ON", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getActivity().getApplicationContext(), "Luz escalera OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });
        trastero.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(getActivity().getApplicationContext(), "Luz trastero ON", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getActivity().getApplicationContext(), "Luz trastero OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });


        return v;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
        ((MainActivityDrawer) activity).onSectionAttached(
                getArguments().getInt(ARG_SECTION_NUMBER));
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(Uri uri);
    }

}
